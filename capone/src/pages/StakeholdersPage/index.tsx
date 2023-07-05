import React, { useEffect, useState } from "react";
import StakeHolderTable from "../../components/organisms/StakeHolderTable";
import { NAVBAR_ITEMS } from "../../components/utils/constants";
import Header from "../../components/molecules/Header";
import NavBar from "../../components/organisms/NavBar";
import PageHeader from "../../components/organisms/PageHeader";
import TextField from "../../components/atoms/TextField";
import { Box, InputAdornment } from "@mui/material";
import SearchIcon from "@mui/icons-material/Search";
import ButtonImg from "../../assets/images/Button.svg";
import axios from "axios";
import { RowData } from "../../components/utils/types";

const StakeholdersPage = () => {
  const [searchValue, setSearchValue] = useState("");
  const [stakeholders, setStakeholders] = useState<RowData[]>([]);


  const filteredData = stakeholders.filter((item) =>
    item.stakeHolder.toLowerCase().includes(searchValue.toLowerCase())

  );

  const handleSearchChange = (event: { target: { value: React.SetStateAction<string>; }; }) => {
    setSearchValue(event.target.value);
  };

  useEffect(() => {
    axios
      .get("http://localhost:3001/stakeholders")
      .then((response) => {
        setStakeholders(response.data);
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
      });
  },[]);
  
  return (
    <div>
      <Header />
      <NavBar activeElement={NAVBAR_ITEMS[3].title} />
      <PageHeader title={"All stakeholders"} buttons />
      <Box
        display={"flex"}
        paddingLeft={5}
        paddingBottom={2.5}
        gap={1}
        alignItems={"center"}
      >
        <TextField
          placeholder="Search..."
          type="text"
          value={searchValue}
          onChange={handleSearchChange}
          InputProps={{
            startAdornment: (
              <InputAdornment position="start">
                <SearchIcon />
              </InputAdornment>
            ),
          }}
          sx={{
            width: "363px",
            "& input": {
              height: "28px",
              padding: "2px 12px",
              fontSize:'15px'
            },
          }}
        />
        <img src={ButtonImg} alt="button" />
      </Box>
      <StakeHolderTable tableData={filteredData} />
    </div>
  );
};

export default StakeholdersPage;
