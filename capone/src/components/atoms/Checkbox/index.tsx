import * as React from "react";
import { Checkbox as MuiCheckbox, SxProps } from "@mui/material";
import { Theme } from "@emotion/react";
import theme from "../../../theme/theme";

interface CheckboxProps {
  checked?: boolean;
  sx?: SxProps<Theme>;
}

const Checkbox = ({ sx, checked }: CheckboxProps) => {
  return (
    <div>
      <MuiCheckbox
        data-testid="checkbox"
        checked={checked}
        color="default"
        size="medium"
        disableRipple
        sx={{
          color: theme.palette.textColor.lowEmphasis,
          "&.Mui-checked": {
            color: theme.palette.primary.primary500,
          },
          "& .MuiSvgIcon-root": {
            fontSize: "16.67px",
          },
          ...sx,
        }}
      />
    </div>
  );
};
export default Checkbox;
